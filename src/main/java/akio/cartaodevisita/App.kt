package akio.cartaodevisita

import akio.cartaodevisita.data.AppDatabase
import akio.cartaodevisita.data.BusinessCardRepository
import android.app.Application

class App : Application() {
    val database by lazy { AppDatabase.getDatabase(this)}
    val repository by lazy { BusinessCardRepository(database.businessDao())}
}