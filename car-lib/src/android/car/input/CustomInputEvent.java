/*
 * Copyright (C) 2020 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package android.car.input;

import static com.android.car.internal.ExcludeFromCodeCoverageGeneratedReport.BOILERPLATE_CODE;

import android.annotation.NonNull;
import android.annotation.SystemApi;
import android.os.Parcel;
import android.os.Parcelable;

import com.android.car.internal.ExcludeFromCodeCoverageGeneratedReport;
import com.android.internal.util.DataClass;

/**
 * {@code Parcelable} containing custom input event.
 *
 * <p>A custom input event representing HW_CUSTOM_INPUT event defined in
 * {@code hardware/interfaces/automotive/vehicle/2.0/types.hal}.
 *
 * @hide
 */
// Note: When re-generating code, make sure inputCodeToString raises an exception in case of invalid
//       input.
// TODO(b/12219669): Check with INPUT_CODE_Fn constants should move to
//     android/car/Constants/CommonConstants.java. If keeping these constants, than add unit tests.
@SystemApi
@DataClass(
        genEqualsHashCode = true,
        genAidl = true)
public final class CustomInputEvent implements Parcelable {

    // The following constant values must be in sync with the ones defined in
    // {@code hardware/interfaces/automotive/vehicle/2.0/types.hal}
    public static final int INPUT_CODE_F1 = 1001;
    public static final int INPUT_CODE_F2 = 1002;
    public static final int INPUT_CODE_F3 = 1003;
    public static final int INPUT_CODE_F4 = 1004;
    public static final int INPUT_CODE_F5 = 1005;
    public static final int INPUT_CODE_F6 = 1006;
    public static final int INPUT_CODE_F7 = 1007;
    public static final int INPUT_CODE_F8 = 1008;
    public static final int INPUT_CODE_F9 = 1009;
    public static final int INPUT_CODE_F10 = 1010;

    @InputCode
    private final int mInputCode;

    private final int mTargetDisplayType;
    private final int mRepeatCounter;


    // Code below generated by codegen v1.0.15.
    //
    // DO NOT MODIFY!
    // CHECKSTYLE:OFF Generated code
    //
    // To regenerate run:
    // $ codegen --to-string $ANDROID_BUILD_TOP/packages/services/Car/car-lib/src/android/car
    // /input/CustomInputEvent.java
    //
    // To exclude the generated code from IntelliJ auto-formatting enable (one-time):
    //   Settings > Editor > Code Style > Formatter Control
    //@formatter:off

    /** @hide */
    @android.annotation.IntDef(prefix = "INPUT_CODE_", value = {
            INPUT_CODE_F1,
            INPUT_CODE_F2,
            INPUT_CODE_F3,
            INPUT_CODE_F4,
            INPUT_CODE_F5,
            INPUT_CODE_F6,
            INPUT_CODE_F7,
            INPUT_CODE_F8,
            INPUT_CODE_F9,
            INPUT_CODE_F10
    })
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @DataClass.Generated.Member
    public @interface InputCode {
    }

    @DataClass.Generated.Member
    @NonNull
    public static String inputCodeToString(@InputCode int value) {
        switch (value) {
            case INPUT_CODE_F1:
                return "INPUT_CODE_F1";
            case INPUT_CODE_F2:
                return "INPUT_CODE_F2";
            case INPUT_CODE_F3:
                return "INPUT_CODE_F3";
            case INPUT_CODE_F4:
                return "INPUT_CODE_F4";
            case INPUT_CODE_F5:
                return "INPUT_CODE_F5";
            case INPUT_CODE_F6:
                return "INPUT_CODE_F6";
            case INPUT_CODE_F7:
                return "INPUT_CODE_F7";
            case INPUT_CODE_F8:
                return "INPUT_CODE_F8";
            case INPUT_CODE_F9:
                return "INPUT_CODE_F9";
            case INPUT_CODE_F10:
                return "INPUT_CODE_F10";
            default:
                throw new java.lang.IllegalArgumentException(
                        "Invalid inputCode {" + value + "}");
        }
    }

    @DataClass.Generated.Member
    public CustomInputEvent(
            @InputCode int inputCode,
            int targetDisplayType,
            int repeatCounter) {
        this.mInputCode = inputCode;

        if (!(mInputCode == INPUT_CODE_F1)
                && !(mInputCode == INPUT_CODE_F2)
                && !(mInputCode == INPUT_CODE_F3)
                && !(mInputCode == INPUT_CODE_F4)
                && !(mInputCode == INPUT_CODE_F5)
                && !(mInputCode == INPUT_CODE_F6)
                && !(mInputCode == INPUT_CODE_F7)
                && !(mInputCode == INPUT_CODE_F8)
                && !(mInputCode == INPUT_CODE_F9)
                && !(mInputCode == INPUT_CODE_F10)) {
            throw new java.lang.IllegalArgumentException(
                    "inputCode was " + mInputCode + " but must be one of: "
                            + "INPUT_CODE_F1(" + INPUT_CODE_F1 + "), "
                            + "INPUT_CODE_F2(" + INPUT_CODE_F2 + "), "
                            + "INPUT_CODE_F3(" + INPUT_CODE_F3 + "), "
                            + "INPUT_CODE_F4(" + INPUT_CODE_F4 + "), "
                            + "INPUT_CODE_F5(" + INPUT_CODE_F5 + "), "
                            + "INPUT_CODE_F6(" + INPUT_CODE_F6 + "), "
                            + "INPUT_CODE_F7(" + INPUT_CODE_F7 + "), "
                            + "INPUT_CODE_F8(" + INPUT_CODE_F8 + "), "
                            + "INPUT_CODE_F9(" + INPUT_CODE_F9 + "), "
                            + "INPUT_CODE_F10(" + INPUT_CODE_F10 + ")");
        }

        this.mTargetDisplayType = targetDisplayType;
        this.mRepeatCounter = repeatCounter;

        // onConstructed(); // You can define this method to get a callback
    }

    @DataClass.Generated.Member
    public @InputCode
    int getInputCode() {
        return mInputCode;
    }

    @DataClass.Generated.Member
    public int getTargetDisplayType() {
        return mTargetDisplayType;
    }

    @DataClass.Generated.Member
    public int getRepeatCounter() {
        return mRepeatCounter;
    }

    @Override
    @DataClass.Generated.Member
    @ExcludeFromCodeCoverageGeneratedReport(reason = BOILERPLATE_CODE)
    public String toString() {
        // You can override field toString logic by defining methods like:
        // String fieldNameToString() { ... }

        return "CustomInputEvent { " +
                "inputCode = " + inputCodeToString(mInputCode) + ", " +
                "targetDisplayType = " + mTargetDisplayType + ", " +
                "repeatCounter = " + mRepeatCounter +
                " }";
    }

    @Override
    @DataClass.Generated.Member
    @ExcludeFromCodeCoverageGeneratedReport(reason = BOILERPLATE_CODE)
    public boolean equals(@android.annotation.Nullable Object o) {
        // You can override field equality logic by defining either of the methods like:
        // boolean fieldNameEquals(CustomInputEvent other) { ... }
        // boolean fieldNameEquals(FieldType otherValue) { ... }

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        @SuppressWarnings("unchecked")
        CustomInputEvent that = (CustomInputEvent) o;
        //noinspection PointlessBooleanExpression
        return true
                && mInputCode == that.mInputCode
                && mTargetDisplayType == that.mTargetDisplayType
                && mRepeatCounter == that.mRepeatCounter;
    }

    @Override
    @DataClass.Generated.Member
    @ExcludeFromCodeCoverageGeneratedReport(reason = BOILERPLATE_CODE)
    public int hashCode() {
        // You can override field hashCode logic by defining methods like:
        // int fieldNameHashCode() { ... }

        int _hash = 1;
        _hash = 31 * _hash + mInputCode;
        _hash = 31 * _hash + mTargetDisplayType;
        _hash = 31 * _hash + mRepeatCounter;
        return _hash;
    }

    @Override
    @DataClass.Generated.Member
    public void writeToParcel(@NonNull Parcel dest, int flags) {
        // You can override field parcelling by defining methods like:
        // void parcelFieldName(Parcel dest, int flags) { ... }

        dest.writeInt(mInputCode);
        dest.writeInt(mTargetDisplayType);
        dest.writeInt(mRepeatCounter);
    }

    @Override
    @DataClass.Generated.Member
    @ExcludeFromCodeCoverageGeneratedReport(reason = BOILERPLATE_CODE)
    public int describeContents() {
        return 0;
    }

    /** @hide */
    @SuppressWarnings({"unchecked", "RedundantCast"})
    @DataClass.Generated.Member
    /* package-private */ CustomInputEvent(@NonNull Parcel in) {
        // You can override field unparcelling by defining methods like:
        // static FieldType unparcelFieldName(Parcel in) { ... }

        int inputCode = in.readInt();
        int targetDisplayType = in.readInt();
        int repeatCounter = in.readInt();

        this.mInputCode = inputCode;

        if (!(mInputCode == INPUT_CODE_F1)
                && !(mInputCode == INPUT_CODE_F2)
                && !(mInputCode == INPUT_CODE_F3)
                && !(mInputCode == INPUT_CODE_F4)
                && !(mInputCode == INPUT_CODE_F5)
                && !(mInputCode == INPUT_CODE_F6)
                && !(mInputCode == INPUT_CODE_F7)
                && !(mInputCode == INPUT_CODE_F8)
                && !(mInputCode == INPUT_CODE_F9)
                && !(mInputCode == INPUT_CODE_F10)) {
            throw new java.lang.IllegalArgumentException(
                    "inputCode was " + mInputCode + " but must be one of: "
                            + "INPUT_CODE_F1(" + INPUT_CODE_F1 + "), "
                            + "INPUT_CODE_F2(" + INPUT_CODE_F2 + "), "
                            + "INPUT_CODE_F3(" + INPUT_CODE_F3 + "), "
                            + "INPUT_CODE_F4(" + INPUT_CODE_F4 + "), "
                            + "INPUT_CODE_F5(" + INPUT_CODE_F5 + "), "
                            + "INPUT_CODE_F6(" + INPUT_CODE_F6 + "), "
                            + "INPUT_CODE_F7(" + INPUT_CODE_F7 + "), "
                            + "INPUT_CODE_F8(" + INPUT_CODE_F8 + "), "
                            + "INPUT_CODE_F9(" + INPUT_CODE_F9 + "), "
                            + "INPUT_CODE_F10(" + INPUT_CODE_F10 + ")");
        }

        this.mTargetDisplayType = targetDisplayType;
        this.mRepeatCounter = repeatCounter;

        // onConstructed(); // You can define this method to get a callback
    }

    @DataClass.Generated.Member
    public static final @NonNull
    Parcelable.Creator<CustomInputEvent> CREATOR
            = new Parcelable.Creator<CustomInputEvent>() {
        @Override
        public CustomInputEvent[] newArray(int size) {
            return new CustomInputEvent[size];
        }

        @Override
        public CustomInputEvent createFromParcel(@NonNull Parcel in) {
            return new CustomInputEvent(in);
        }
    };

    @DataClass.Generated(
            time = 1600715769152L,
            codegenVersion = "1.0.15",
            sourceFile = "packages/services/Car/car-lib/src/android/car/input/CustomInputEvent"
                    + ".java",
            inputSignatures = "public static final  int INPUT_CODE_F1\npublic static final  int "
                    + "INPUT_CODE_F2\npublic static final  int INPUT_CODE_F3\npublic static final"
                    + "  int INPUT_CODE_F4\npublic static final  int INPUT_CODE_F5\npublic static"
                    + " final  int INPUT_CODE_F6\npublic static final  int INPUT_CODE_F7\npublic "
                    + "static final  int INPUT_CODE_F8\npublic static final  int "
                    + "INPUT_CODE_F9\npublic static final  int INPUT_CODE_F10\nprivate final "
                    + "@android.car.input.CustomInputEvent.InputCode int mInputCode\nprivate "
                    + "final  int mTargetDisplayType\nprivate final  int mRepeatCounter\nclass "
                    + "CustomInputEvent extends java.lang.Object implements [android.os"
                    + ".Parcelable]\n@com.android.internal.util.DataClass(genEqualsHashCode=true,"
                    + " genAidl=true)")
    @Deprecated
    @ExcludeFromCodeCoverageGeneratedReport(reason = BOILERPLATE_CODE)
    private void __metadata() {
    }

    //@formatter:on
    // End of generated code
}

