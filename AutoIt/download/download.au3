#include <InetConstants.au3>
#include <MsgBoxConstants.au3>
#include <WinAPIFiles.au3>

; Download a file in the background.
; Wait for the download to complete.

Example()

Func Example()




	; Download the file by waiting for it to complete. The option of 'get the file from the local cache' has been selected.
	Local $iBytesSize = InetGet("http://selenium-release.storage.googleapis.com/4.0-alpha5/selenium-server-4.0.0-alpha-5.jar", "C:\Users\Jino\Desktop\downlaoded\sel4.jar", $INET_FORCERELOAD)


EndFunc   ;==>Example
