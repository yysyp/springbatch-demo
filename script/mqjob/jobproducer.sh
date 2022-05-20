#!/bin/bash

wqfile="$1workqueue"
echo "file=$wqfile"
i=0
while [ $i -ne 100 ]
do
   i=$(($i+1))
if [ -s $wqfile ]
then
   echo " workqueue is not empty "
   sleep 1
else
   echo "add line..."
   date=$(date '+%Y-%m-%d %H:%M:%S')
   echo "add line " $date >> $wqfile
fi
done
exit 0
