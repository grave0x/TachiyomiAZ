package eu.kanade.tachiyomi.ui.extension.repos

import android.view.View
import androidx.core.view.isVisible
import eu.davidea.viewholders.FlexibleViewHolder
import eu.kanade.tachiyomi.databinding.RepoItemBinding

/**
 * Holder used to display repo items.
 *
 * @param view The view used by repo items.
 * @param adapter The adapter containing this holder.
 */
class RepoHolder(view: View, val adapter: RepoAdapter) : FlexibleViewHolder(view, adapter) {
    private val binding = RepoItemBinding.bind(view)

    /**
     * Binds this holder with the given repo URL.
     *
     * @param repo The repo to bind.
     */
    fun bind(repo: String) {
        binding.title.text = repo
    }
}
