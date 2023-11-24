package `in`.kaligotla.datastructures.data.proto

import androidx.lifecycle.LiveData

interface OnboardStateRepository {
    suspend fun getOnboardState(): LiveData<Boolean>
    suspend fun updateOnboardState(onboardState: Boolean)
    suspend fun resetData()
    suspend fun clearOnboardState()
}