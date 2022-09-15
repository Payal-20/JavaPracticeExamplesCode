import os
import time
pid=os.fork()
if pid:
    # parent
   # while True:
	wfPath = "./p1"
	rfPath = "./p2"
	msg= raw_input("Enter a message to send to child via pipe : ")
	try:
	    os.mkfifo(wfPath)
	    os.mkfifo(rfPath)
	except OSError:
	    pass
	wp = open(wfPath, 'w')
	wp.write(msg)
	wp.close()
	rp = open(rfPath, 'r')
	response = rp.read()
	print "Reverse String from process B: %s" % response
else:
    # child
    #while True:
        rfPath = "./p1"
	wfPath = "./p2"
	try:  os.mkfifo(wfPath)
	    os.mkfifo(rfPath)
	except OSError:
	    pass
	rp = open(rfPath, 'r')
	response = rp.read()
	print "String received from process A: %s" % response
	s=response
	s=s[::-1]
	rp.close()
	wp = open(wfPath, 'w')
	wp.write(s)
	wp.close()
	rp.close()
