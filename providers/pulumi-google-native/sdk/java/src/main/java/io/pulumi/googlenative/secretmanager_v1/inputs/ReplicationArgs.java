// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.secretmanager_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.secretmanager_v1.inputs.AutomaticArgs;
import io.pulumi.googlenative.secretmanager_v1.inputs.UserManagedArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A policy that defines the replication and encryption configuration of data.
 * 
 */
public final class ReplicationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ReplicationArgs Empty = new ReplicationArgs();

    /**
     * The Secret will automatically be replicated without any restrictions.
     * 
     */
    @Import(name="automatic")
      private final @Nullable Output<AutomaticArgs> automatic;

    public Output<AutomaticArgs> getAutomatic() {
        return this.automatic == null ? Output.empty() : this.automatic;
    }

    /**
     * The Secret will only be replicated into the locations specified.
     * 
     */
    @Import(name="userManaged")
      private final @Nullable Output<UserManagedArgs> userManaged;

    public Output<UserManagedArgs> getUserManaged() {
        return this.userManaged == null ? Output.empty() : this.userManaged;
    }

    public ReplicationArgs(
        @Nullable Output<AutomaticArgs> automatic,
        @Nullable Output<UserManagedArgs> userManaged) {
        this.automatic = automatic;
        this.userManaged = userManaged;
    }

    private ReplicationArgs() {
        this.automatic = Output.empty();
        this.userManaged = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReplicationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<AutomaticArgs> automatic;
        private @Nullable Output<UserManagedArgs> userManaged;

        public Builder() {
    	      // Empty
        }

        public Builder(ReplicationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.automatic = defaults.automatic;
    	      this.userManaged = defaults.userManaged;
        }

        public Builder automatic(@Nullable Output<AutomaticArgs> automatic) {
            this.automatic = automatic;
            return this;
        }
        public Builder automatic(@Nullable AutomaticArgs automatic) {
            this.automatic = Output.ofNullable(automatic);
            return this;
        }
        public Builder userManaged(@Nullable Output<UserManagedArgs> userManaged) {
            this.userManaged = userManaged;
            return this;
        }
        public Builder userManaged(@Nullable UserManagedArgs userManaged) {
            this.userManaged = Output.ofNullable(userManaged);
            return this;
        }        public ReplicationArgs build() {
            return new ReplicationArgs(automatic, userManaged);
        }
    }
}
