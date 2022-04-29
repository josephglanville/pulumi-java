// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DatabaseMigration.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetJobOutputItem {
    /**
     * @return Job output line.
     * 
     */
    private final String message;

    @CustomType.Constructor
    private GetJobOutputItem(@CustomType.Parameter("message") String message) {
        this.message = message;
    }

    /**
     * @return Job output line.
     * 
     */
    public String message() {
        return this.message;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetJobOutputItem defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String message;

        public Builder() {
    	      // Empty
        }

        public Builder(GetJobOutputItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.message = defaults.message;
        }

        public Builder message(String message) {
            this.message = Objects.requireNonNull(message);
            return this;
        }        public GetJobOutputItem build() {
            return new GetJobOutputItem(message);
        }
    }
}
