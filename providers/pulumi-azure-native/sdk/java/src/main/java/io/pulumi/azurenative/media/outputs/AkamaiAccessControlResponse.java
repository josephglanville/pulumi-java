// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.outputs;

import io.pulumi.azurenative.media.outputs.AkamaiSignatureHeaderAuthenticationKeyResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class AkamaiAccessControlResponse {
    private final @Nullable List<AkamaiSignatureHeaderAuthenticationKeyResponse> akamaiSignatureHeaderAuthenticationKeyList;

    @OutputCustomType.Constructor({"akamaiSignatureHeaderAuthenticationKeyList"})
    private AkamaiAccessControlResponse(@Nullable List<AkamaiSignatureHeaderAuthenticationKeyResponse> akamaiSignatureHeaderAuthenticationKeyList) {
        this.akamaiSignatureHeaderAuthenticationKeyList = akamaiSignatureHeaderAuthenticationKeyList;
    }

    public List<AkamaiSignatureHeaderAuthenticationKeyResponse> getAkamaiSignatureHeaderAuthenticationKeyList() {
        return this.akamaiSignatureHeaderAuthenticationKeyList == null ? List.of() : this.akamaiSignatureHeaderAuthenticationKeyList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AkamaiAccessControlResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<AkamaiSignatureHeaderAuthenticationKeyResponse> akamaiSignatureHeaderAuthenticationKeyList;

        public Builder() {
    	      // Empty
        }

        public Builder(AkamaiAccessControlResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.akamaiSignatureHeaderAuthenticationKeyList = defaults.akamaiSignatureHeaderAuthenticationKeyList;
        }

        public Builder setAkamaiSignatureHeaderAuthenticationKeyList(@Nullable List<AkamaiSignatureHeaderAuthenticationKeyResponse> akamaiSignatureHeaderAuthenticationKeyList) {
            this.akamaiSignatureHeaderAuthenticationKeyList = akamaiSignatureHeaderAuthenticationKeyList;
            return this;
        }

        public AkamaiAccessControlResponse build() {
            return new AkamaiAccessControlResponse(akamaiSignatureHeaderAuthenticationKeyList);
        }
    }
}
