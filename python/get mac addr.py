import re, uuid
print "Mac Addr:" + ':'.join(re.findall('..', '%012x' % uuid.getnode()))
   
