// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.memorydb.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetACLArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetACLArgs Empty = new GetACLArgs();

    /**
     * The name of the acl.
     * 
     */
    @Import(name="aCLName", required=true)
      private final String aCLName;

    public String getACLName() {
        return this.aCLName;
    }

    public GetACLArgs(String aCLName) {
        this.aCLName = Objects.requireNonNull(aCLName, "expected parameter 'aCLName' to be non-null");
    }

    private GetACLArgs() {
        this.aCLName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetACLArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String aCLName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetACLArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aCLName = defaults.aCLName;
        }

        public Builder aCLName(String aCLName) {
            this.aCLName = Objects.requireNonNull(aCLName);
            return this;
        }        public GetACLArgs build() {
            return new GetACLArgs(aCLName);
        }
    }
}
