// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Sch.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetServiceConnectorSourceCursor {
    /**
     * @return The type descriminator.
     * 
     */
    private final String kind;

    @CustomType.Constructor
    private GetServiceConnectorSourceCursor(@CustomType.Parameter("kind") String kind) {
        this.kind = kind;
    }

    /**
     * @return The type descriminator.
     * 
     */
    public String kind() {
        return this.kind;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceConnectorSourceCursor defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String kind;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServiceConnectorSourceCursor defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kind = defaults.kind;
        }

        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }        public GetServiceConnectorSourceCursor build() {
            return new GetServiceConnectorSourceCursor(kind);
        }
    }
}
