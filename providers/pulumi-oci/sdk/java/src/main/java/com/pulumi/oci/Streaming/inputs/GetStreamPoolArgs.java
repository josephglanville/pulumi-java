// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Streaming.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetStreamPoolArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetStreamPoolArgs Empty = new GetStreamPoolArgs();

    /**
     * The OCID of the stream pool.
     * 
     */
    @Import(name="streamPoolId", required=true)
    private String streamPoolId;

    /**
     * @return The OCID of the stream pool.
     * 
     */
    public String streamPoolId() {
        return this.streamPoolId;
    }

    private GetStreamPoolArgs() {}

    private GetStreamPoolArgs(GetStreamPoolArgs $) {
        this.streamPoolId = $.streamPoolId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetStreamPoolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetStreamPoolArgs $;

        public Builder() {
            $ = new GetStreamPoolArgs();
        }

        public Builder(GetStreamPoolArgs defaults) {
            $ = new GetStreamPoolArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param streamPoolId The OCID of the stream pool.
         * 
         * @return builder
         * 
         */
        public Builder streamPoolId(String streamPoolId) {
            $.streamPoolId = streamPoolId;
            return this;
        }

        public GetStreamPoolArgs build() {
            $.streamPoolId = Objects.requireNonNull($.streamPoolId, "expected parameter 'streamPoolId' to be non-null");
            return $;
        }
    }

}
