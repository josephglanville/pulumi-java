// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.msk.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterClientAuthenticationSaslGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterClientAuthenticationSaslGetArgs Empty = new ClusterClientAuthenticationSaslGetArgs();

    /**
     * Enables IAM client authentication. Defaults to `false`.
     * 
     */
    @Import(name="iam")
      private final @Nullable Output<Boolean> iam;

    public Output<Boolean> getIam() {
        return this.iam == null ? Output.empty() : this.iam;
    }

    /**
     * Enables SCRAM client authentication via AWS Secrets Manager. Defaults to `false`.
     * 
     */
    @Import(name="scram")
      private final @Nullable Output<Boolean> scram;

    public Output<Boolean> getScram() {
        return this.scram == null ? Output.empty() : this.scram;
    }

    public ClusterClientAuthenticationSaslGetArgs(
        @Nullable Output<Boolean> iam,
        @Nullable Output<Boolean> scram) {
        this.iam = iam;
        this.scram = scram;
    }

    private ClusterClientAuthenticationSaslGetArgs() {
        this.iam = Output.empty();
        this.scram = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterClientAuthenticationSaslGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> iam;
        private @Nullable Output<Boolean> scram;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterClientAuthenticationSaslGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.iam = defaults.iam;
    	      this.scram = defaults.scram;
        }

        public Builder iam(@Nullable Output<Boolean> iam) {
            this.iam = iam;
            return this;
        }
        public Builder iam(@Nullable Boolean iam) {
            this.iam = Output.ofNullable(iam);
            return this;
        }
        public Builder scram(@Nullable Output<Boolean> scram) {
            this.scram = scram;
            return this;
        }
        public Builder scram(@Nullable Boolean scram) {
            this.scram = Output.ofNullable(scram);
            return this;
        }        public ClusterClientAuthenticationSaslGetArgs build() {
            return new ClusterClientAuthenticationSaslGetArgs(iam, scram);
        }
    }
}