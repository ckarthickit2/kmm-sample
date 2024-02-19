import SwiftUI
import Shared

struct ContentView: View {
    @State private var showContent = false
    var body: some View {
        let phrases = Greeting().greet()
        List(phrases, id: \.self) {
            Text($0)
        }
    }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}
