// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudformation;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class HookDefaultVersionArgs extends io.pulumi.resources.ResourceArgs {

    public static final HookDefaultVersionArgs Empty = new HookDefaultVersionArgs();

    /**
     * The name of the type being registered.
     * 
     * We recommend that type names adhere to the following pattern: company_or_organization::service::type.
     * 
     */
    @InputImport(name="typeName")
      private final @Nullable Input<String> typeName;

    public Input<String> getTypeName() {
        return this.typeName == null ? Input.empty() : this.typeName;
    }

    /**
     * The Amazon Resource Name (ARN) of the type version.
     * 
     */
    @InputImport(name="typeVersionArn")
      private final @Nullable Input<String> typeVersionArn;

    public Input<String> getTypeVersionArn() {
        return this.typeVersionArn == null ? Input.empty() : this.typeVersionArn;
    }

    /**
     * The ID of an existing version of the hook to set as the default.
     * 
     */
    @InputImport(name="versionId")
      private final @Nullable Input<String> versionId;

    public Input<String> getVersionId() {
        return this.versionId == null ? Input.empty() : this.versionId;
    }

    public HookDefaultVersionArgs(
        @Nullable Input<String> typeName,
        @Nullable Input<String> typeVersionArn,
        @Nullable Input<String> versionId) {
        this.typeName = typeName;
        this.typeVersionArn = typeVersionArn;
        this.versionId = versionId;
    }

    private HookDefaultVersionArgs() {
        this.typeName = Input.empty();
        this.typeVersionArn = Input.empty();
        this.versionId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HookDefaultVersionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> typeName;
        private @Nullable Input<String> typeVersionArn;
        private @Nullable Input<String> versionId;

        public Builder() {
    	      // Empty
        }

        public Builder(HookDefaultVersionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.typeName = defaults.typeName;
    	      this.typeVersionArn = defaults.typeVersionArn;
    	      this.versionId = defaults.versionId;
        }

        public Builder setTypeName(@Nullable Input<String> typeName) {
            this.typeName = typeName;
            return this;
        }

        public Builder setTypeName(@Nullable String typeName) {
            this.typeName = Input.ofNullable(typeName);
            return this;
        }

        public Builder setTypeVersionArn(@Nullable Input<String> typeVersionArn) {
            this.typeVersionArn = typeVersionArn;
            return this;
        }

        public Builder setTypeVersionArn(@Nullable String typeVersionArn) {
            this.typeVersionArn = Input.ofNullable(typeVersionArn);
            return this;
        }

        public Builder setVersionId(@Nullable Input<String> versionId) {
            this.versionId = versionId;
            return this;
        }

        public Builder setVersionId(@Nullable String versionId) {
            this.versionId = Input.ofNullable(versionId);
            return this;
        }
        public HookDefaultVersionArgs build() {
            return new HookDefaultVersionArgs(typeName, typeVersionArn, versionId);
        }
    }
}
