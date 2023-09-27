// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.repro.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class Bar {
    private @Nullable String hasahyphen;

    private Bar() {}
    public Optional<String> hasahyphen() {
        return Optional.ofNullable(this.hasahyphen);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(Bar defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String hasahyphen;
        public Builder() {}
        public Builder(Bar defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hasahyphen = defaults.hasahyphen;
        }

        @CustomType.Setter("has-a-hyphen")
        public Builder hasahyphen(@Nullable String hasahyphen) {

            this.hasahyphen = hasahyphen;
            return this;
        }
        public Bar build() {
            final var o = new Bar();
            o.hasahyphen = hasahyphen;
            return o;
        }
    }
}
