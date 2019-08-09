const Posts = require('../model/post');

const Post = require('../model/post')
exports.index = async (req, res)=> {
  try{
    let databaseQuery = await Posts.find({}, (err, data)=>{
      if(err){
        process.stdout.write(`Error querying data: ${err}`)
      }
    });
    res.render('index', { postData: databaseQuery })
  } catch(err){
    process.stdout.write(err)
  }
};

exports.indexPost = (req, res)=>{
  let userPost = new Post({ post: req.body.name })
  userPost.save((err, data)=>{
    if(err){
      process.stdout.write(`Error saving data ${err}`)
    }
    console.log(data)
  })
  res.redirect('/')
};