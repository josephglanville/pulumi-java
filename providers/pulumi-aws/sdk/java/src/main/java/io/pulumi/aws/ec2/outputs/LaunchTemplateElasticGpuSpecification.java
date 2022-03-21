// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class LaunchTemplateElasticGpuSpecification {
    /**
     * The [Elastic GPU Type](https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/elastic-gpus.html#elastic-gpus-basics)
     * 
     */
    private final String type;

    @CustomType.Constructor
    private LaunchTemplateElasticGpuSpecification(@CustomType.Parameter("type") String type) {
        this.type = type;
    }

    /**
     * The [Elastic GPU Type](https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/elastic-gpus.html#elastic-gpus-basics)
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LaunchTemplateElasticGpuSpecification defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(LaunchTemplateElasticGpuSpecification defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public LaunchTemplateElasticGpuSpecification build() {
            return new LaunchTemplateElasticGpuSpecification(type);
        }
    }
}
