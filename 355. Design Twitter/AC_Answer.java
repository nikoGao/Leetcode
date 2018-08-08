public class Twitter {
    
    private static int timestamp = 0;
    private HashMap<Integer, User> userlist;

    /** Initialize your data structure here. */
    public Twitter() {
        userlist = new HashMap<>();
    }
    
    /** Compose a new tweet. */
    public void postTweet(int userId, int tweetId) {
        if(!userlist.containsKey(userId)) userlist.put(userId, new User(userId));
        userlist.get(userId).post(tweetId);
    }
    
    /** Retrieve the 10 most recent tweet ids in the user's news feed. Each item in the news feed must be posted by users who the user followed or by the user herself. Tweets must be ordered from most recent to least recent. */
    public List<Integer> getNewsFeed(int userId) {
        List<Integer> feeds = new ArrayList<>();
        if(!userlist.containsKey(userId)) return feeds;
        
        User current = userlist.get(userId);
        Set<Integer> followeds = userlist.get(userId).followed;
        Queue<Tweet> tweets = new PriorityQueue<Tweet>((a,b)->(b.time-a.time));
        // add current user and its followees' tweet_head into a descending priorityQueue
        if(current.tweet_head!=null) tweets.offer(current.tweet_head);
        for(int user:followeds){
            User twitter = userlist.get(user);
            if(twitter.tweet_head!=null) tweets.offer(twitter.tweet_head);
        }
        
        // start to find all feeds
        while(!tweets.isEmpty() && feeds.size()<10){
            Tweet feed = tweets.poll();
            feeds.add(feed.id);
            if(feed.next!=null) tweets.offer(feed.next);
        }
        return feeds;
    }
    
    /** Follower follows a followee. If the operation is invalid, it should be a no-op. */
    public void follow(int followerId, int followeeId) {
        if(followerId==followeeId) return;
        if(!userlist.containsKey(followerId)) userlist.put(followerId, new User(followerId));
        if(!userlist.containsKey(followeeId)) userlist.put(followeeId, new User(followeeId));
        userlist.get(followerId).follow(followeeId);
    }
    
    /** Follower unfollows a followee. If the operation is invalid, it should be a no-op. */
    public void unfollow(int followerId, int followeeId) {
        if(!userlist.containsKey(followerId) || followerId==followeeId) return;
        userlist.get(followerId).unfollow(followeeId);
    }
    
    // create User class
    public class User{
        private int id;
        public Tweet tweet_head;
        public Set<Integer> followed;
        
        public User(int id){
            this.id = id;
            this.followed = new HashSet<>();
            this.tweet_head = null;
        }
        
        public void follow(int followeeId){
            this.followed.add(followeeId);
        }
        
        public void unfollow(int followeeId){
            this.followed.remove(followeeId);
        }
        
        public void post(int tweetId){
            Tweet new_tweet = new Tweet(tweetId);
            new_tweet.next = this.tweet_head;
            this.tweet_head = new_tweet;
        }
    }
    
    // create Tweet class
    private class Tweet{
        public int id;
        public Tweet next;
        public int time;
        
        public Tweet(int id){
            this.id = id;
            this.time = timestamp++;
            this.next = null;
        }
    }
}

/**
 * Your Twitter object will be instantiated and called as such:
 * Twitter obj = new Twitter();
 * obj.postTweet(userId,tweetId);
 * List<Integer> param_2 = obj.getNewsFeed(userId);
 * obj.follow(followerId,followeeId);
 * obj.unfollow(followerId,followeeId);
 */
