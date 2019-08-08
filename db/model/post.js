let mongoose = require('mongoose'),
process = require('process')

mongoose.connect(process.env.MONGO_DB_URI, {useNewUrlParser: true});

const PostShema = new mongoose.Schema({
  post:String
});

let Post = new mongoose.model('Post', PostShema);

module.exports = Post