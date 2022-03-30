package co.kingsleyetoka.common.di

import co.kingsleyetoka.common.utils.CoroutineDispatchersProvider
import co.kingsleyetoka.common.utils.DispatchersProvider
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityRetainedComponent

@Module
@InstallIn(ActivityRetainedComponent::class)
abstract class ActivityRetainedModule {
    @Binds
    abstract fun bindDispatchersProvider(dispatchersProvider: CoroutineDispatchersProvider): DispatchersProvider
}