package org.acme.repository;

import io.quarkus.test.junit.NativeImageTest;

@NativeImageTest
public class NativeTodoResourceIT extends TodoResourceTest {

    // Execute the same tests but in native mode.
}