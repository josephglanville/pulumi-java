// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes a pre-shared key used to setup MACsec in static connectivity association key (CAK) mode.
 * 
 */
public final class InterconnectMacsecPreSharedKeyArgs extends io.pulumi.resources.ResourceArgs {

    public static final InterconnectMacsecPreSharedKeyArgs Empty = new InterconnectMacsecPreSharedKeyArgs();

    /**
     * A name for this pre-shared key. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    /**
     * A RFC3339 timestamp on or after which the key is valid. startTime can be in the future. If the keychain has a single key, startTime can be omitted. If the keychain has multiple keys, startTime is mandatory for each key. The start times of keys must be in increasing order. The start times of two consecutive keys must be at least 6 hours apart.
     * 
     */
    @Import(name="startTime")
      private final @Nullable Output<String> startTime;

    public Output<String> getStartTime() {
        return this.startTime == null ? Output.empty() : this.startTime;
    }

    public InterconnectMacsecPreSharedKeyArgs(
        Output<String> name,
        @Nullable Output<String> startTime) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.startTime = startTime;
    }

    private InterconnectMacsecPreSharedKeyArgs() {
        this.name = Output.empty();
        this.startTime = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InterconnectMacsecPreSharedKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> name;
        private @Nullable Output<String> startTime;

        public Builder() {
    	      // Empty
        }

        public Builder(InterconnectMacsecPreSharedKeyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.startTime = defaults.startTime;
        }

        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }
        public Builder startTime(@Nullable Output<String> startTime) {
            this.startTime = startTime;
            return this;
        }
        public Builder startTime(@Nullable String startTime) {
            this.startTime = Output.ofNullable(startTime);
            return this;
        }        public InterconnectMacsecPreSharedKeyArgs build() {
            return new InterconnectMacsecPreSharedKeyArgs(name, startTime);
        }
    }
}
