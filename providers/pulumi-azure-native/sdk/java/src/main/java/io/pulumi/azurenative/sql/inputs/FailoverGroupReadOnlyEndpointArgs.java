// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql.inputs;

import io.pulumi.azurenative.sql.enums.ReadOnlyEndpointFailoverPolicy;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Read-only endpoint of the failover group instance.
 * 
 */
public final class FailoverGroupReadOnlyEndpointArgs extends io.pulumi.resources.ResourceArgs {

    public static final FailoverGroupReadOnlyEndpointArgs Empty = new FailoverGroupReadOnlyEndpointArgs();

    /**
     * Failover policy of the read-only endpoint for the failover group.
     * 
     */
    @InputImport(name="failoverPolicy")
      private final @Nullable Input<Either<String,ReadOnlyEndpointFailoverPolicy>> failoverPolicy;

    public Input<Either<String,ReadOnlyEndpointFailoverPolicy>> getFailoverPolicy() {
        return this.failoverPolicy == null ? Input.empty() : this.failoverPolicy;
    }

    public FailoverGroupReadOnlyEndpointArgs(@Nullable Input<Either<String,ReadOnlyEndpointFailoverPolicy>> failoverPolicy) {
        this.failoverPolicy = failoverPolicy;
    }

    private FailoverGroupReadOnlyEndpointArgs() {
        this.failoverPolicy = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FailoverGroupReadOnlyEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Either<String,ReadOnlyEndpointFailoverPolicy>> failoverPolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(FailoverGroupReadOnlyEndpointArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.failoverPolicy = defaults.failoverPolicy;
        }

        public Builder setFailoverPolicy(@Nullable Input<Either<String,ReadOnlyEndpointFailoverPolicy>> failoverPolicy) {
            this.failoverPolicy = failoverPolicy;
            return this;
        }

        public Builder setFailoverPolicy(@Nullable Either<String,ReadOnlyEndpointFailoverPolicy> failoverPolicy) {
            this.failoverPolicy = Input.ofNullable(failoverPolicy);
            return this;
        }
        public FailoverGroupReadOnlyEndpointArgs build() {
            return new FailoverGroupReadOnlyEndpointArgs(failoverPolicy);
        }
    }
}
