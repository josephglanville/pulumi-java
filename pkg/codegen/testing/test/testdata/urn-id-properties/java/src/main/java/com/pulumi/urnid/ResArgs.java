// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.urnid;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ResArgs extends com.pulumi.resources.ResourceArgs {

    public static final ResArgs Empty = new ResArgs();

    @Import(name="id")
    private @Nullable Output<String> id;

    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    @Import(name="urn")
    private @Nullable Output<String> urn;

    public Optional<Output<String>> urn() {
        return Optional.ofNullable(this.urn);
    }

    private ResArgs() {}

    private ResArgs(ResArgs $) {
        this.id = $.id;
        this.urn = $.urn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResArgs $;

        public Builder() {
            $ = new ResArgs();
        }

        public Builder(ResArgs defaults) {
            $ = new ResArgs(Objects.requireNonNull(defaults));
        }

        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        public Builder id(String id) {
            return id(Output.of(id));
        }

        public Builder urn(@Nullable Output<String> urn) {
            $.urn = urn;
            return this;
        }

        public Builder urn(String urn) {
            return urn(Output.of(urn));
        }

        public ResArgs build() {
            return $;
        }
    }

}
