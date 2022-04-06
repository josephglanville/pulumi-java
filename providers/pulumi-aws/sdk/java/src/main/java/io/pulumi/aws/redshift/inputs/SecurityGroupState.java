// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.redshift.inputs;

import io.pulumi.aws.redshift.inputs.SecurityGroupIngressGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SecurityGroupState extends io.pulumi.resources.ResourceArgs {

    public static final SecurityGroupState Empty = new SecurityGroupState();

    /**
     * The description of the Redshift security group. Defaults to "Managed by Pulumi".
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * A list of ingress rules.
     * 
     */
    @Import(name="ingress")
      private final @Nullable Output<List<SecurityGroupIngressGetArgs>> ingress;

    public Output<List<SecurityGroupIngressGetArgs>> getIngress() {
        return this.ingress == null ? Output.empty() : this.ingress;
    }

    /**
     * The name of the Redshift security group.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    public SecurityGroupState(
        @Nullable Output<String> description,
        @Nullable Output<List<SecurityGroupIngressGetArgs>> ingress,
        @Nullable Output<String> name) {
        this.description = description == null ? Output.ofNullable("Managed by Pulumi") : description;
        this.ingress = ingress;
        this.name = name;
    }

    private SecurityGroupState() {
        this.description = Output.empty();
        this.ingress = Output.empty();
        this.name = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityGroupState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<List<SecurityGroupIngressGetArgs>> ingress;
        private @Nullable Output<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityGroupState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.ingress = defaults.ingress;
    	      this.name = defaults.name;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }
        public Builder ingress(@Nullable Output<List<SecurityGroupIngressGetArgs>> ingress) {
            this.ingress = ingress;
            return this;
        }
        public Builder ingress(@Nullable List<SecurityGroupIngressGetArgs> ingress) {
            this.ingress = Output.ofNullable(ingress);
            return this;
        }
        public Builder ingress(SecurityGroupIngressGetArgs... ingress) {
            return ingress(List.of(ingress));
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }        public SecurityGroupState build() {
            return new SecurityGroupState(description, ingress, name);
        }
    }
}