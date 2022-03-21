// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.azurenative.media.inputs.AkamaiSignatureHeaderAuthenticationKeyResponse;
import io.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Akamai access control
 * 
 */
public final class AkamaiAccessControlResponse extends io.pulumi.resources.InvokeArgs {

    public static final AkamaiAccessControlResponse Empty = new AkamaiAccessControlResponse();

    /**
     * authentication key list
     * 
     */
    @Import(name="akamaiSignatureHeaderAuthenticationKeyList")
      private final @Nullable List<AkamaiSignatureHeaderAuthenticationKeyResponse> akamaiSignatureHeaderAuthenticationKeyList;

    public List<AkamaiSignatureHeaderAuthenticationKeyResponse> getAkamaiSignatureHeaderAuthenticationKeyList() {
        return this.akamaiSignatureHeaderAuthenticationKeyList == null ? List.of() : this.akamaiSignatureHeaderAuthenticationKeyList;
    }

    public AkamaiAccessControlResponse(@Nullable List<AkamaiSignatureHeaderAuthenticationKeyResponse> akamaiSignatureHeaderAuthenticationKeyList) {
        this.akamaiSignatureHeaderAuthenticationKeyList = akamaiSignatureHeaderAuthenticationKeyList;
    }

    private AkamaiAccessControlResponse() {
        this.akamaiSignatureHeaderAuthenticationKeyList = List.of();
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

        public Builder akamaiSignatureHeaderAuthenticationKeyList(@Nullable List<AkamaiSignatureHeaderAuthenticationKeyResponse> akamaiSignatureHeaderAuthenticationKeyList) {
            this.akamaiSignatureHeaderAuthenticationKeyList = akamaiSignatureHeaderAuthenticationKeyList;
            return this;
        }
        public Builder akamaiSignatureHeaderAuthenticationKeyList(AkamaiSignatureHeaderAuthenticationKeyResponse... akamaiSignatureHeaderAuthenticationKeyList) {
            return akamaiSignatureHeaderAuthenticationKeyList(List.of(akamaiSignatureHeaderAuthenticationKeyList));
        }        public AkamaiAccessControlResponse build() {
            return new AkamaiAccessControlResponse(akamaiSignatureHeaderAuthenticationKeyList);
        }
    }
}
