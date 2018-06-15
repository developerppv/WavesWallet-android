package com.wavesplatform.wallet.v2.ui.home.wallet.assets.adapter

import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder
import com.wavesplatform.wallet.R
import com.wavesplatform.wallet.v2.data.model.local.Language
import com.wavesplatform.wallet.v2.util.loadImage
import kotlinx.android.synthetic.main.wallet_asset_item.view.*
import javax.inject.Inject

class AssetsAdapter @Inject constructor() : BaseQuickAdapter<TestObject, BaseViewHolder>(R.layout.wallet_asset_item, null) {

    override fun convert(helper: BaseViewHolder, item: TestObject) {
        helper.setText(R.id.text_asset_name, item.assetName)
                .setText(R.id.text_asset_value, "0000000.00")
                .setGone(R.id.image_favourite, item.isFavourite)
                .setGone(R.id.image_down_arrow, item.isOut)
                .setVisible(R.id.text_tag_spam, item.isSpam)

        helper.itemView.image_asset_icon.loadImage("", text = item.assetName)
    }
}