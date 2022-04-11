// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sso;

import io.pulumi.awsnative.sso.inputs.InstanceAccessControlAttributeConfigurationAccessControlAttributeArgs;
import io.pulumi.awsnative.sso.inputs.InstanceAccessControlAttributeConfigurationPropertiesArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceAccessControlAttributeConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceAccessControlAttributeConfigurationArgs Empty = new InstanceAccessControlAttributeConfigurationArgs();

    @Import(name="accessControlAttributes")
      private final @Nullable Output<List<InstanceAccessControlAttributeConfigurationAccessControlAttributeArgs>> accessControlAttributes;

    public Output<List<InstanceAccessControlAttributeConfigurationAccessControlAttributeArgs>> getAccessControlAttributes() {
        return this.accessControlAttributes == null ? Codegen.empty() : this.accessControlAttributes;
    }

    /**
     * The InstanceAccessControlAttributeConfiguration property has been deprecated but is still supported for backwards compatibility purposes. We recomend that you use  AccessControlAttributes property instead.
     * 
     */
    @Import(name="instanceAccessControlAttributeConfiguration")
      private final @Nullable Output<InstanceAccessControlAttributeConfigurationPropertiesArgs> instanceAccessControlAttributeConfiguration;

    public Output<InstanceAccessControlAttributeConfigurationPropertiesArgs> getInstanceAccessControlAttributeConfiguration() {
        return this.instanceAccessControlAttributeConfiguration == null ? Codegen.empty() : this.instanceAccessControlAttributeConfiguration;
    }

    /**
     * The ARN of the AWS SSO instance under which the operation will be executed.
     * 
     */
    @Import(name="instanceArn", required=true)
      private final Output<String> instanceArn;

    public Output<String> getInstanceArn() {
        return this.instanceArn;
    }

    public InstanceAccessControlAttributeConfigurationArgs(
        @Nullable Output<List<InstanceAccessControlAttributeConfigurationAccessControlAttributeArgs>> accessControlAttributes,
        @Nullable Output<InstanceAccessControlAttributeConfigurationPropertiesArgs> instanceAccessControlAttributeConfiguration,
        Output<String> instanceArn) {
        this.accessControlAttributes = accessControlAttributes;
        this.instanceAccessControlAttributeConfiguration = instanceAccessControlAttributeConfiguration;
        this.instanceArn = Objects.requireNonNull(instanceArn, "expected parameter 'instanceArn' to be non-null");
    }

    private InstanceAccessControlAttributeConfigurationArgs() {
        this.accessControlAttributes = Codegen.empty();
        this.instanceAccessControlAttributeConfiguration = Codegen.empty();
        this.instanceArn = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceAccessControlAttributeConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<InstanceAccessControlAttributeConfigurationAccessControlAttributeArgs>> accessControlAttributes;
        private @Nullable Output<InstanceAccessControlAttributeConfigurationPropertiesArgs> instanceAccessControlAttributeConfiguration;
        private Output<String> instanceArn;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceAccessControlAttributeConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessControlAttributes = defaults.accessControlAttributes;
    	      this.instanceAccessControlAttributeConfiguration = defaults.instanceAccessControlAttributeConfiguration;
    	      this.instanceArn = defaults.instanceArn;
        }

        public Builder accessControlAttributes(@Nullable Output<List<InstanceAccessControlAttributeConfigurationAccessControlAttributeArgs>> accessControlAttributes) {
            this.accessControlAttributes = accessControlAttributes;
            return this;
        }
        public Builder accessControlAttributes(@Nullable List<InstanceAccessControlAttributeConfigurationAccessControlAttributeArgs> accessControlAttributes) {
            this.accessControlAttributes = Codegen.ofNullable(accessControlAttributes);
            return this;
        }
        public Builder accessControlAttributes(InstanceAccessControlAttributeConfigurationAccessControlAttributeArgs... accessControlAttributes) {
            return accessControlAttributes(List.of(accessControlAttributes));
        }
        public Builder instanceAccessControlAttributeConfiguration(@Nullable Output<InstanceAccessControlAttributeConfigurationPropertiesArgs> instanceAccessControlAttributeConfiguration) {
            this.instanceAccessControlAttributeConfiguration = instanceAccessControlAttributeConfiguration;
            return this;
        }
        public Builder instanceAccessControlAttributeConfiguration(@Nullable InstanceAccessControlAttributeConfigurationPropertiesArgs instanceAccessControlAttributeConfiguration) {
            this.instanceAccessControlAttributeConfiguration = Codegen.ofNullable(instanceAccessControlAttributeConfiguration);
            return this;
        }
        public Builder instanceArn(Output<String> instanceArn) {
            this.instanceArn = Objects.requireNonNull(instanceArn);
            return this;
        }
        public Builder instanceArn(String instanceArn) {
            this.instanceArn = Output.of(Objects.requireNonNull(instanceArn));
            return this;
        }        public InstanceAccessControlAttributeConfigurationArgs build() {
            return new InstanceAccessControlAttributeConfigurationArgs(accessControlAttributes, instanceAccessControlAttributeConfiguration, instanceArn);
        }
    }
}
