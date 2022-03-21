// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.transfer.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class AccessHomeDirectoryMapping {
    /**
     * Represents an entry and a target.
     * 
     */
    private final String entry;
    /**
     * Represents the map target.
     * 
     */
    private final String target;

    @CustomType.Constructor
    private AccessHomeDirectoryMapping(
        @CustomType.Parameter("entry") String entry,
        @CustomType.Parameter("target") String target) {
        this.entry = entry;
        this.target = target;
    }

    /**
     * Represents an entry and a target.
     * 
    */
    public String getEntry() {
        return this.entry;
    }
    /**
     * Represents the map target.
     * 
    */
    public String getTarget() {
        return this.target;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessHomeDirectoryMapping defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String entry;
        private String target;

        public Builder() {
    	      // Empty
        }

        public Builder(AccessHomeDirectoryMapping defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.entry = defaults.entry;
    	      this.target = defaults.target;
        }

        public Builder entry(String entry) {
            this.entry = Objects.requireNonNull(entry);
            return this;
        }
        public Builder target(String target) {
            this.target = Objects.requireNonNull(target);
            return this;
        }        public AccessHomeDirectoryMapping build() {
            return new AccessHomeDirectoryMapping(entry, target);
        }
    }
}
