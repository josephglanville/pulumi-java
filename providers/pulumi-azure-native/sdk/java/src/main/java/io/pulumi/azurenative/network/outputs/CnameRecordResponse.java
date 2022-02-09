// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class CnameRecordResponse {
    private final @Nullable String cname;

    @OutputCustomType.Constructor({"cname"})
    private CnameRecordResponse(@Nullable String cname) {
        this.cname = cname;
    }

    public Optional<String> getCname() {
        return Optional.ofNullable(this.cname);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CnameRecordResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String cname;

        public Builder() {
    	      // Empty
        }

        public Builder(CnameRecordResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cname = defaults.cname;
        }

        public Builder setCname(@Nullable String cname) {
            this.cname = cname;
            return this;
        }

        public CnameRecordResponse build() {
            return new CnameRecordResponse(cname);
        }
    }
}
