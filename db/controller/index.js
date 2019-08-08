exports.index = (req, res)=> {
  res.render('index')
};

exports.indexPost = (req, res)=>{
  console.log(req.body)
  res.redirect('/')
};