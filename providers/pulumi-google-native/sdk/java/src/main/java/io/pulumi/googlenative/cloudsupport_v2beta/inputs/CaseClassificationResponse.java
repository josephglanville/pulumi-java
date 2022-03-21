// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudsupport_v2beta.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * A classification object with a product type and value.
 * 
 */
public final class CaseClassificationResponse extends io.pulumi.resources.InvokeArgs {

    public static final CaseClassificationResponse Empty = new CaseClassificationResponse();

    /**
     * The display name of the classification.
     * 
     */
    @Import(name="displayName", required=true)
      private final String displayName;

    public String getDisplayName() {
        return this.displayName;
    }

    public CaseClassificationResponse(String displayName) {
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
    }

    private CaseClassificationResponse() {
        this.displayName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CaseClassificationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String displayName;

        public Builder() {
    	      // Empty
        }

        public Builder(CaseClassificationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
        }

        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }        public CaseClassificationResponse build() {
            return new CaseClassificationResponse(displayName);
        }
    }
}
