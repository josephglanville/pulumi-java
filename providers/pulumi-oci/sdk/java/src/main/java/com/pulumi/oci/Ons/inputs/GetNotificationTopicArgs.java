// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Ons.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetNotificationTopicArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetNotificationTopicArgs Empty = new GetNotificationTopicArgs();

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the topic to retrieve.
     * 
     */
    @Import(name="topicId", required=true)
    private String topicId;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the topic to retrieve.
     * 
     */
    public String topicId() {
        return this.topicId;
    }

    private GetNotificationTopicArgs() {}

    private GetNotificationTopicArgs(GetNotificationTopicArgs $) {
        this.topicId = $.topicId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetNotificationTopicArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetNotificationTopicArgs $;

        public Builder() {
            $ = new GetNotificationTopicArgs();
        }

        public Builder(GetNotificationTopicArgs defaults) {
            $ = new GetNotificationTopicArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param topicId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the topic to retrieve.
         * 
         * @return builder
         * 
         */
        public Builder topicId(String topicId) {
            $.topicId = topicId;
            return this;
        }

        public GetNotificationTopicArgs build() {
            $.topicId = Objects.requireNonNull($.topicId, "expected parameter 'topicId' to be non-null");
            return $;
        }
    }

}
