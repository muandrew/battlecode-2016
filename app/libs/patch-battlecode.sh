#$1 battlecode-<version>.jar
if [[ ! $1 =~ battlecode.*jar$ ]];
then
	echo 'You need to specify the battlecode jar to minpulate'
	exit 1
fi

cp $1 $1.bak
jar uf $1 battlecode/instrumenter/bytecode/resources/AllowedPackages.txt
