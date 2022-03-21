// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dynamics365fraudprotection.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * An array of administrator user identities
 * 
 */
public final class DFPInstanceAdministratorsArgs extends io.pulumi.resources.ResourceArgs {

    public static final DFPInstanceAdministratorsArgs Empty = new DFPInstanceAdministratorsArgs();

    /**
     * An array of administrator user identities.
     * 
     */
    @Import(name="members")
      private final @Nullable Output<List<String>> members;

    public Output<List<String>> getMembers() {
        return this.members == null ? Output.empty() : this.members;
    }

    public DFPInstanceAdministratorsArgs(@Nullable Output<List<String>> members) {
        this.members = members;
    }

    private DFPInstanceAdministratorsArgs() {
        this.members = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DFPInstanceAdministratorsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> members;

        public Builder() {
    	      // Empty
        }

        public Builder(DFPInstanceAdministratorsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.members = defaults.members;
        }

        public Builder members(@Nullable Output<List<String>> members) {
            this.members = members;
            return this;
        }
        public Builder members(@Nullable List<String> members) {
            this.members = Output.ofNullable(members);
            return this;
        }
        public Builder members(String... members) {
            return members(List.of(members));
        }        public DFPInstanceAdministratorsArgs build() {
            return new DFPInstanceAdministratorsArgs(members);
        }
    }
}
