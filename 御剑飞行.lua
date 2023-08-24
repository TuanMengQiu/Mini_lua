function anxia(event) 
Player:changPlayerMoveType(event.eventobjid,1)
Player:changeViewMode(event.eventobjid,3,false)
Player:setMobileVibrate(event.eventobjid, 10, 255)
end
ScriptSupportEvent:registerEvent([=[Player.EquipOn]=], anxia)

function anxia2(event) 
Player:changPlayerMoveType(event.eventobjid,2)
Player:changeViewMode(event.eventobjid,0,false)
end
ScriptSupportEvent:registerEvent([=[Player.EquipOff]=], anxia2)