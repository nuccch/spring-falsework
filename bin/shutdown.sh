#!/bin/bash

echo "Shutdown ..."

current_path=`pwd`
case "`uname`" in
	Linux)
		bin_absolute_path=$(readlink -f $(dirname $0)) 
		;;
	*)
		bin_absolute_path=`cd $(dirname $0);pwd`
		;;
esac

export LANG=en_US.UTF-8
base_dir=${bin_absolute_path}/..
pid_file=$base_dir/bin/pid

pid=`cat $pid_file`
kill -15 $pid

rm -rf $pid_file

echo "Done."
