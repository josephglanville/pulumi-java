// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.costmanagement.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ReportConfigGroupingResponse {
    /**
     * The name of the column to group. This version supports subscription lowest possible grain.
     * 
     */
    private final String name;
    /**
     * Has type of the column to group.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private ReportConfigGroupingResponse(
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("type") String type) {
        this.name = name;
        this.type = type;
    }

    /**
     * The name of the column to group. This version supports subscription lowest possible grain.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Has type of the column to group.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReportConfigGroupingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ReportConfigGroupingResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public ReportConfigGroupingResponse build() {
            return new ReportConfigGroupingResponse(name, type);
        }
    }
}
