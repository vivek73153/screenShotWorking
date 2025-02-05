/*
  Copyright (c) 2007-2012 by Jakob Schroeter <js@camaya.net>
  This file is part of the gloox library. http://camaya.net/gloox

  This software is distributed under a license. The full license
  agreement can be found in the file LICENSE in this distribution.
  This software may not be copied, modified, sold or distributed
  other than expressed in the named license agreement.

  This software is distributed without any warranty.
*/



#include "instantmucroom.h"
#include "clientbase.h"
#include "jid.h"

namespace gloox
{

  InstantMUCRoom::InstantMUCRoom( ClientBase* parent, const JID& nick, MUCRoomHandler* mrh )
    : MUCRoom( parent, nick, mrh, 0 )
  {
  }

  InstantMUCRoom::~InstantMUCRoom()
  {
  }

}
