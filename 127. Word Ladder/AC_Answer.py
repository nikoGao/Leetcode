# Accepted but not understand, an interesting way to find neighbors


 def make_p2w(word_list, w_idxs):
            """Creates a map of all combinations of words with missing letters mapped 
            to all words in the list that match that pattern.
            E.g. hot -> {'_ot': ['hot'], 'h_t': ['hot'], 'ho_': ['hot']}
            """
            p2w = collections.defaultdict(list)
            
            for word in word_list:
                for i, j in w_idxs:
                    p = word[:i] + "_" + word[j:]
                    p2w[p].append(word)
            return p2w
            
        def bfs_words(begin, end, w_idxs, p2w):
            queue = collections.deque([(begin, 1)])
            visited = set([begin])
                        
            while queue:
                # Get the next node to explore from the top of the queue
                word, depth = queue.popleft()
                
                # Get the node's children 
                # By recreating all possible patterns for that string
                for i,j in w_idxs:
                    p = word[:i] + "_" + word[j:]
                    neighbor_words = p2w[p]
                    # Iterate through children
                    for nw in neighbor_words:
                        if nw not in visited:
                            # Goal check (before adding to the queue)
                            if nw == end:
                                return depth+1
                            # Add to visited
                            # These is no reason to wait to mark nodes as visited. Because this is 
                            # a BFS, once a node has been seen that is the earliest it could have
                            # possibly been seen so any other path to that node would either be 
                            # longer or the same length as what we've already observed.
                            visited.add(nw)                            
                            # Add to the end of the queue
                            queue.append((nw, depth+1))
            return 0
        
        # Get word length and character indexes
        wl = len(beginWord)
        w_indexes = zip(range(wl), range(1, wl+1))
        # Preprocess words into a map
        patterns2words = make_p2w(wordList | set([beginWord, endWord]), w_indexes)
        # Do the search
        return bfs_words(beginWord, endWord, w_indexes, patterns2words)

