package ru.yandex.practicum.contacts.presentation.base;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;

public class BaseListDiffCallback <T extends ListDiffInterface<T>> extends DiffUtil.ItemCallback<T>   {
T t;

    @Override
    public boolean areItemsTheSame(@NonNull T t, @NonNull T o) {
        return t.theSameAs(t);
    }

    @Override
    public boolean areContentsTheSame(@NonNull T t, @NonNull T o) {
        return false;
    }
}
