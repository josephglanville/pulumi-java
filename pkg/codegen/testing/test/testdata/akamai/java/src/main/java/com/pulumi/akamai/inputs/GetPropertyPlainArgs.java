// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPropertyPlainArgs Empty = new GetPropertyPlainArgs();

    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    @Import(name="version")
    private @Nullable Integer version;

    public Optional<Integer> version() {
        return Optional.ofNullable(this.version);
    }

    private GetPropertyPlainArgs() {}

    private GetPropertyPlainArgs(GetPropertyPlainArgs $) {
        this.name = $.name;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyPlainArgs $;

        public Builder() {
            $ = new GetPropertyPlainArgs();
        }

        public Builder(GetPropertyPlainArgs defaults) {
            $ = new GetPropertyPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public Builder version(@Nullable Integer version) {
            $.version = version;
            return this;
        }

        public GetPropertyPlainArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetPropertyPlainArgs", "name");
            }
            return $;
        }
    }

}
