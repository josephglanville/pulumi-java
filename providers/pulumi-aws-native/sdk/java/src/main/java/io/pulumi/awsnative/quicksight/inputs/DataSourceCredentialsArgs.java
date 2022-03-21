// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.inputs;

import io.pulumi.awsnative.quicksight.inputs.DataSourceCredentialPairArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * <p>Data source credentials. This is a variant type structure. For this structure to be
 *             valid, only one of the attributes can be non-null.</p>
 * 
 */
public final class DataSourceCredentialsArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataSourceCredentialsArgs Empty = new DataSourceCredentialsArgs();

    /**
     * <p>The Amazon Resource Name (ARN) of a data source that has the credential pair that you
     *             want to use. When <code>CopySourceArn</code> is not null, the credential pair from the
     *             data source in the ARN is used as the credentials for the
     *             <code>DataSourceCredentials</code> structure.</p>
     * 
     */
    @Import(name="copySourceArn")
      private final @Nullable Output<String> copySourceArn;

    public Output<String> getCopySourceArn() {
        return this.copySourceArn == null ? Output.empty() : this.copySourceArn;
    }

    @Import(name="credentialPair")
      private final @Nullable Output<DataSourceCredentialPairArgs> credentialPair;

    public Output<DataSourceCredentialPairArgs> getCredentialPair() {
        return this.credentialPair == null ? Output.empty() : this.credentialPair;
    }

    public DataSourceCredentialsArgs(
        @Nullable Output<String> copySourceArn,
        @Nullable Output<DataSourceCredentialPairArgs> credentialPair) {
        this.copySourceArn = copySourceArn;
        this.credentialPair = credentialPair;
    }

    private DataSourceCredentialsArgs() {
        this.copySourceArn = Output.empty();
        this.credentialPair = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceCredentialsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> copySourceArn;
        private @Nullable Output<DataSourceCredentialPairArgs> credentialPair;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceCredentialsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.copySourceArn = defaults.copySourceArn;
    	      this.credentialPair = defaults.credentialPair;
        }

        public Builder copySourceArn(@Nullable Output<String> copySourceArn) {
            this.copySourceArn = copySourceArn;
            return this;
        }
        public Builder copySourceArn(@Nullable String copySourceArn) {
            this.copySourceArn = Output.ofNullable(copySourceArn);
            return this;
        }
        public Builder credentialPair(@Nullable Output<DataSourceCredentialPairArgs> credentialPair) {
            this.credentialPair = credentialPair;
            return this;
        }
        public Builder credentialPair(@Nullable DataSourceCredentialPairArgs credentialPair) {
            this.credentialPair = Output.ofNullable(credentialPair);
            return this;
        }        public DataSourceCredentialsArgs build() {
            return new DataSourceCredentialsArgs(copySourceArn, credentialPair);
        }
    }
}
