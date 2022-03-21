// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.rds.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetCertificateArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetCertificateArgs Empty = new GetCertificateArgs();

    /**
     * Certificate identifier. For example, `rds-ca-2019`.
     * 
     */
    @Import(name="id")
      private final @Nullable String id;

    public Optional<String> getId() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    /**
     * When enabled, returns the certificate with the latest `ValidTill`.
     * 
     */
    @Import(name="latestValidTill")
      private final @Nullable Boolean latestValidTill;

    public Optional<Boolean> getLatestValidTill() {
        return this.latestValidTill == null ? Optional.empty() : Optional.ofNullable(this.latestValidTill);
    }

    public GetCertificateArgs(
        @Nullable String id,
        @Nullable Boolean latestValidTill) {
        this.id = id;
        this.latestValidTill = latestValidTill;
    }

    private GetCertificateArgs() {
        this.id = null;
        this.latestValidTill = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String id;
        private @Nullable Boolean latestValidTill;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCertificateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.latestValidTill = defaults.latestValidTill;
        }

        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder latestValidTill(@Nullable Boolean latestValidTill) {
            this.latestValidTill = latestValidTill;
            return this;
        }        public GetCertificateArgs build() {
            return new GetCertificateArgs(id, latestValidTill);
        }
    }
}
