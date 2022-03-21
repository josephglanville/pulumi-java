// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class StorageLensAwsOrg {
    private final String arn;

    @CustomType.Constructor
    private StorageLensAwsOrg(@CustomType.Parameter("arn") String arn) {
        this.arn = arn;
    }

    public String getArn() {
        return this.arn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StorageLensAwsOrg defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;

        public Builder() {
    	      // Empty
        }

        public Builder(StorageLensAwsOrg defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
        }

        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }        public StorageLensAwsOrg build() {
            return new StorageLensAwsOrg(arn);
        }
    }
}
