const Post = require('../model/post')
exports.index = (req, res)=> {
  res.render('index')
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