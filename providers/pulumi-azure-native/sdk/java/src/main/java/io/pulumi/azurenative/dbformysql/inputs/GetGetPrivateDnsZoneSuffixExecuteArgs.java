// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dbformysql.inputs;

import java.util.Objects;


public final class GetGetPrivateDnsZoneSuffixExecuteArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetGetPrivateDnsZoneSuffixExecuteArgs Empty = new GetGetPrivateDnsZoneSuffixExecuteArgs();

    public GetGetPrivateDnsZoneSuffixExecuteArgs() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGetPrivateDnsZoneSuffixExecuteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(GetGetPrivateDnsZoneSuffixExecuteArgs defaults) {
    	      Objects.requireNonNull(defaults);
        }

        public GetGetPrivateDnsZoneSuffixExecuteArgs build() {
            return new GetGetPrivateDnsZoneSuffixExecuteArgs();
        }
    }
}
