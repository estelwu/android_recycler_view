# android_recycler_view

## To Research
1. Pattern (How different parts work with each other?)
  - RecyclerView
  - Adapter
  - ViewHolder
2. override methods (What is the purpose of each method?)
  - onCreateViewHolder()
  - onBindViewHolder()
  - getItemCount()
  - [optional]getItemViewType()
3. Render sequence in RecyclerView? How the items re-used, why click event wrong?

## Strange bugs
1. After scroll, position reuse. onClickListener & onLikeListener wrong click event.
