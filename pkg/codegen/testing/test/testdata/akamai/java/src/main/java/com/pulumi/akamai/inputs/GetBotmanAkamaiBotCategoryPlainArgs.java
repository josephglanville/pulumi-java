// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetBotmanAkamaiBotCategoryPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetBotmanAkamaiBotCategoryPlainArgs Empty = new GetBotmanAkamaiBotCategoryPlainArgs();

    @Import(name="categoryName")
    private @Nullable String categoryName;

    public Optional<String> categoryName() {
        return Optional.ofNullable(this.categoryName);
    }

    private GetBotmanAkamaiBotCategoryPlainArgs() {}

    private GetBotmanAkamaiBotCategoryPlainArgs(GetBotmanAkamaiBotCategoryPlainArgs $) {
        this.categoryName = $.categoryName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetBotmanAkamaiBotCategoryPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetBotmanAkamaiBotCategoryPlainArgs $;

        public Builder() {
            $ = new GetBotmanAkamaiBotCategoryPlainArgs();
        }

        public Builder(GetBotmanAkamaiBotCategoryPlainArgs defaults) {
            $ = new GetBotmanAkamaiBotCategoryPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder categoryName(@Nullable String categoryName) {
            $.categoryName = categoryName;
            return this;
        }

        public GetBotmanAkamaiBotCategoryPlainArgs build() {
            return $;
        }
    }

}
