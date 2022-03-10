// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.waf.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetWebAclResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String name;

    @OutputCustomType.Constructor
    private GetWebAclResult(
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("name") String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWebAclResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWebAclResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public GetWebAclResult build() {
            return new GetWebAclResult(id, name);
        }
    }
}
