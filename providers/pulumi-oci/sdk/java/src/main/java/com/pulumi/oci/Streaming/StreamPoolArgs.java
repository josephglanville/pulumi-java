// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Streaming;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.oci.Streaming.inputs.StreamPoolCustomEncryptionKeyArgs;
import com.pulumi.oci.Streaming.inputs.StreamPoolKafkaSettingsArgs;
import com.pulumi.oci.Streaming.inputs.StreamPoolPrivateEndpointSettingsArgs;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class StreamPoolArgs extends com.pulumi.resources.ResourceArgs {

    public static final StreamPoolArgs Empty = new StreamPoolArgs();

    /**
     * (Updatable) The OCID of the compartment that contains the stream.
     * 
     */
    @Import(name="compartmentId", required=true)
    private Output<String> compartmentId;

    /**
     * @return (Updatable) The OCID of the compartment that contains the stream.
     * 
     */
    public Output<String> compartmentId() {
        return this.compartmentId;
    }

    /**
     * (Updatable) The OCID of the custom encryption key to be used or deleted if currently being used.
     * 
     */
    @Import(name="customEncryptionKey")
    private @Nullable Output<StreamPoolCustomEncryptionKeyArgs> customEncryptionKey;

    /**
     * @return (Updatable) The OCID of the custom encryption key to be used or deleted if currently being used.
     * 
     */
    public Optional<Output<StreamPoolCustomEncryptionKeyArgs>> customEncryptionKey() {
        return Optional.ofNullable(this.customEncryptionKey);
    }

    /**
     * (Updatable) Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).  Example: `{&#34;Operations.CostCenter&#34;: &#34;42&#34;}`
     * 
     */
    @Import(name="definedTags")
    private @Nullable Output<Map<String,Object>> definedTags;

    /**
     * @return (Updatable) Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).  Example: `{&#34;Operations.CostCenter&#34;: &#34;42&#34;}`
     * 
     */
    public Optional<Output<Map<String,Object>>> definedTags() {
        return Optional.ofNullable(this.definedTags);
    }

    /**
     * (Updatable) Free-form tags for this resource. Each tag is a simple key-value pair that is applied with no predefined name, type, or namespace. Exists for cross-compatibility only. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).  Example: `{&#34;Department&#34;: &#34;Finance&#34;}`
     * 
     */
    @Import(name="freeformTags")
    private @Nullable Output<Map<String,Object>> freeformTags;

    /**
     * @return (Updatable) Free-form tags for this resource. Each tag is a simple key-value pair that is applied with no predefined name, type, or namespace. Exists for cross-compatibility only. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).  Example: `{&#34;Department&#34;: &#34;Finance&#34;}`
     * 
     */
    public Optional<Output<Map<String,Object>>> freeformTags() {
        return Optional.ofNullable(this.freeformTags);
    }

    /**
     * (Updatable) Settings for the Kafka compatibility layer.
     * 
     */
    @Import(name="kafkaSettings")
    private @Nullable Output<StreamPoolKafkaSettingsArgs> kafkaSettings;

    /**
     * @return (Updatable) Settings for the Kafka compatibility layer.
     * 
     */
    public Optional<Output<StreamPoolKafkaSettingsArgs>> kafkaSettings() {
        return Optional.ofNullable(this.kafkaSettings);
    }

    /**
     * (Updatable) The name of the stream pool. Avoid entering confidential information.  Example: `MyStreamPool`
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return (Updatable) The name of the stream pool. Avoid entering confidential information.  Example: `MyStreamPool`
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Optional parameters if a private stream pool is requested.
     * 
     */
    @Import(name="privateEndpointSettings")
    private @Nullable Output<StreamPoolPrivateEndpointSettingsArgs> privateEndpointSettings;

    /**
     * @return Optional parameters if a private stream pool is requested.
     * 
     */
    public Optional<Output<StreamPoolPrivateEndpointSettingsArgs>> privateEndpointSettings() {
        return Optional.ofNullable(this.privateEndpointSettings);
    }

    private StreamPoolArgs() {}

    private StreamPoolArgs(StreamPoolArgs $) {
        this.compartmentId = $.compartmentId;
        this.customEncryptionKey = $.customEncryptionKey;
        this.definedTags = $.definedTags;
        this.freeformTags = $.freeformTags;
        this.kafkaSettings = $.kafkaSettings;
        this.name = $.name;
        this.privateEndpointSettings = $.privateEndpointSettings;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StreamPoolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StreamPoolArgs $;

        public Builder() {
            $ = new StreamPoolArgs();
        }

        public Builder(StreamPoolArgs defaults) {
            $ = new StreamPoolArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param compartmentId (Updatable) The OCID of the compartment that contains the stream.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(Output<String> compartmentId) {
            $.compartmentId = compartmentId;
            return this;
        }

        /**
         * @param compartmentId (Updatable) The OCID of the compartment that contains the stream.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(String compartmentId) {
            return compartmentId(Output.of(compartmentId));
        }

        /**
         * @param customEncryptionKey (Updatable) The OCID of the custom encryption key to be used or deleted if currently being used.
         * 
         * @return builder
         * 
         */
        public Builder customEncryptionKey(@Nullable Output<StreamPoolCustomEncryptionKeyArgs> customEncryptionKey) {
            $.customEncryptionKey = customEncryptionKey;
            return this;
        }

        /**
         * @param customEncryptionKey (Updatable) The OCID of the custom encryption key to be used or deleted if currently being used.
         * 
         * @return builder
         * 
         */
        public Builder customEncryptionKey(StreamPoolCustomEncryptionKeyArgs customEncryptionKey) {
            return customEncryptionKey(Output.of(customEncryptionKey));
        }

        /**
         * @param definedTags (Updatable) Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).  Example: `{&#34;Operations.CostCenter&#34;: &#34;42&#34;}`
         * 
         * @return builder
         * 
         */
        public Builder definedTags(@Nullable Output<Map<String,Object>> definedTags) {
            $.definedTags = definedTags;
            return this;
        }

        /**
         * @param definedTags (Updatable) Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).  Example: `{&#34;Operations.CostCenter&#34;: &#34;42&#34;}`
         * 
         * @return builder
         * 
         */
        public Builder definedTags(Map<String,Object> definedTags) {
            return definedTags(Output.of(definedTags));
        }

        /**
         * @param freeformTags (Updatable) Free-form tags for this resource. Each tag is a simple key-value pair that is applied with no predefined name, type, or namespace. Exists for cross-compatibility only. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).  Example: `{&#34;Department&#34;: &#34;Finance&#34;}`
         * 
         * @return builder
         * 
         */
        public Builder freeformTags(@Nullable Output<Map<String,Object>> freeformTags) {
            $.freeformTags = freeformTags;
            return this;
        }

        /**
         * @param freeformTags (Updatable) Free-form tags for this resource. Each tag is a simple key-value pair that is applied with no predefined name, type, or namespace. Exists for cross-compatibility only. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).  Example: `{&#34;Department&#34;: &#34;Finance&#34;}`
         * 
         * @return builder
         * 
         */
        public Builder freeformTags(Map<String,Object> freeformTags) {
            return freeformTags(Output.of(freeformTags));
        }

        /**
         * @param kafkaSettings (Updatable) Settings for the Kafka compatibility layer.
         * 
         * @return builder
         * 
         */
        public Builder kafkaSettings(@Nullable Output<StreamPoolKafkaSettingsArgs> kafkaSettings) {
            $.kafkaSettings = kafkaSettings;
            return this;
        }

        /**
         * @param kafkaSettings (Updatable) Settings for the Kafka compatibility layer.
         * 
         * @return builder
         * 
         */
        public Builder kafkaSettings(StreamPoolKafkaSettingsArgs kafkaSettings) {
            return kafkaSettings(Output.of(kafkaSettings));
        }

        /**
         * @param name (Updatable) The name of the stream pool. Avoid entering confidential information.  Example: `MyStreamPool`
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name (Updatable) The name of the stream pool. Avoid entering confidential information.  Example: `MyStreamPool`
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param privateEndpointSettings Optional parameters if a private stream pool is requested.
         * 
         * @return builder
         * 
         */
        public Builder privateEndpointSettings(@Nullable Output<StreamPoolPrivateEndpointSettingsArgs> privateEndpointSettings) {
            $.privateEndpointSettings = privateEndpointSettings;
            return this;
        }

        /**
         * @param privateEndpointSettings Optional parameters if a private stream pool is requested.
         * 
         * @return builder
         * 
         */
        public Builder privateEndpointSettings(StreamPoolPrivateEndpointSettingsArgs privateEndpointSettings) {
            return privateEndpointSettings(Output.of(privateEndpointSettings));
        }

        public StreamPoolArgs build() {
            $.compartmentId = Objects.requireNonNull($.compartmentId, "expected parameter 'compartmentId' to be non-null");
            return $;
        }
    }

}
