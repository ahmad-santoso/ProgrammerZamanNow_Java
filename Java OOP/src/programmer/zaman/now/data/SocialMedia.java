package programmer.zaman.now.data;

class SocialMedia {
    String name;
}

class Facebook extends SocialMedia {
    final void login (String username, String Password) {
        // isi method
    }
}


class FakeFacebook extends Facebook {
// Error
//    void login (String username, String Password) {
//        // isi method
//    }
}
