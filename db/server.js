const express = require('express'),
process = require('process');

const app = express();

app.use('/', require('./routes/index'))

const PORT = process.env.PORT || 3000

app.listen(PORT, ()=>{
  process.stdout.write(`Listening for request on Port ${PORT}`)
})

module.exports = app